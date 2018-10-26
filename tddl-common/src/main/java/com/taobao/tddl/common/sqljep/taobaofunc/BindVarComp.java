//package com.taobao.tddl.common.sqljep.taobaofunc;
//
//import java.util.List;
//
//import com.taobao.tddl.common.sqljep.CompableBindValue;
//import com.taobao.tddl.common.sqljep.UnknowValueObject;
//
//
//public class BindVarComp implements CompableBindValue{
//	private List<Object> bindList=null;
//	private int index;
//	public BindVarComp(int index) {
//		this.index=index;
//	}
//	public void setBindList(List<Object> li){
//		this.bindList=li;
//	}
//	public int getIndex(){
//		return index;
//	}
//	@SuppressWarnings("unchecked")
//	public int compareTo(Object obj) {
//		Comparable comp = getBindVal();
//
//		Comparable comp1=null;
//		if(obj instanceof Comparable){
//			comp1=(Comparable)obj;
//			}else{
//				throw new IllegalArgumentException("index为"+index+"的数据不是comparable对象");
//			}
//		return comp1.compareTo(comp);
//	}
//	@SuppressWarnings("unchecked")
//	public Comparable<?> getBindVal() {
//		Comparable comp=null;
//		try {
//			Object obj = bindList.get(index);
//			if (obj instanceof Comparable) {
//				comp = (Comparable) obj;
//			} else {
//				return UnknowValueObject.getUnknowValueObject();
//			}
//		} catch (IndexOutOfBoundsException e) {
//			throw new IllegalArgumentException("指定index："+index+"的数据没有绑定变量");
//		}catch (NullPointerException e) {
//			throw new IllegalArgumentException("未能获取绑定变量");
//		}
//		return comp;
//	}
//	public String toString() {
//		return this.getBindValObj().toString();
//	}
//	public Object getBindValObj() {
//		Object obj=null;
//		try {
//			obj = bindList.get(index);
//		} catch (IndexOutOfBoundsException e) {
//			throw new IllegalArgumentException("指定index："+index+"的数据没有绑定变量");
//		}catch (NullPointerException e) {
//			throw new IllegalArgumentException("未能获取绑定变量");
//		}
//		return obj;
//	}
//
//}
