package com.taobao.tddl.sqlobjecttree;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.taobao.tddl.sqlobjecttree.common.value.BindVar;

public abstract class PageWrapperCommon {
	//可以被替换的值
	protected boolean canBeChanged;
	protected  Integer index;
	//当前保存在List中的值
	protected  Number value;
	public PageWrapperCommon(Object obj) {
		if(obj instanceof BindVar){
			index=((BindVar)obj).getIndex();
		}else if(obj instanceof Number){
			this.value=(Number)obj;
		}else{
			throw new IllegalStateException("不能通过绑定变量或sql获取limit参数");
		}
	}
	public String toString() {
		if(index!=null){
			return "?";
		}else if(value!=null){
			return value.toString();
		}else{
			throw new IllegalStateException("不应该出现没有值直接写在sql,但也没有index的情况");
		}
	}
	/**
	 *	获取limit的值，如果需要替换则替换
	 * @param limitFrom 为闭区间skip值 ,对应到mysql时会自动-1
	 * @param limitTo 为开区间max值，对应到mysql时会使用max-skip的方式取得mysql需要的range值
	 * @param param
	 * @param allowChangeValue 允许替换,一个值需要替换needChangeVal,并且当前输出设定为允许替换allowChangeValue的时候。目标值就会被替换掉了
	 * @return
	 */
	public String getSqlEle(Number limitFrom,Number limitTo,List<Object> param,boolean allowChangeValue,Map<Integer, Object> changeParam) {
		if(index!=null){
			if(canBeChanged&&allowChangeValue){
				modifyParam(limitFrom,limitTo,param,changeParam);
			}
			return "?";
		}else if(value!= null){
			if(canBeChanged&&allowChangeValue){
				return getSqlReturn(limitFrom,limitTo);
			}else{
				return value.toString();
			}

		}else{
			throw new IllegalStateException("不应该出现没有值直接写在sql,但也没有index的情况");
		}
	}
	protected abstract void modifyParam(Number limitFrom, Number limitTo,List<Object> param,Map<Integer, Object> changeParam);
	protected abstract String getSqlReturn(Number limitFrom,Number limitTo);

	public Long getVal(List<Object> argument) {
		Number temp = null;
		if (argument == null) {
			throw new IllegalArgumentException("参数为空");
		}
		if (index != null) {
			Object obj = argument.get(index);
			if (obj instanceof Number) {
				temp = (Number) obj;
			} else {
				throw new IllegalArgumentException("index 值为" + index
						+ "的参数不为number类型");
			}
		} else if (value != null) {
			if (value != null) {
				temp = value;
			} else {
				throw new IllegalStateException("不应该出现没有值直接写在sql,但也没有index的情况");
			}
		} else {
			throw new IllegalStateException("分页函数无值");
		}
		if (temp instanceof Long || temp instanceof Integer) {
			return temp.longValue();
		} else if(temp instanceof BigDecimal){
			return ((BigDecimal) temp).longValueExact();
		}else{
			throw new IllegalArgumentException("分页参数只支持int long");
		}
	}
	public boolean canBeChange() {
		return canBeChanged;
	}
	public void setCanBeChanged(boolean canBeChanged) {
		this.canBeChanged = canBeChanged;
	}

}
