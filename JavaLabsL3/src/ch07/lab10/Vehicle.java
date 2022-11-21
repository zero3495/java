package ch07.lab10;

public class Vehicle {
	  double  load ;
	  double  maxLoad ; 
	  Vehicle (double maxLoad) {
	    this.maxLoad = maxLoad ; 
	  }
	  double  getLoad() {
	    return load ;
	  }  
	  // 請設計一個方法能取代下列三個方法
	  
	  public boolean addCargo(Weight  w ) {
		 System.out.println("變數w所屬類別:" + w.getClass().getName());
		 if (w instanceof IFeeling) {
			 IFeeling iFeeling = (IFeeling)w;
			 System.out.println("變數iFeeling所屬類別:" + w.getClass().getName());
			 iFeeling.smile();
			 iFeeling.cry();
		 }
		 if(load + w.getWeight() > maxLoad) {
			return false;
		 }else {
			load += w.getWeight();
			return true;
		 }
	  }
	  /*
	  // 下列三個方法必須被替換。
	  boolean addCargo(Dog d) {
	      if (load + d.dogWeight > maxLoad) 
	          return false ;
	      else {
	       	  load += d.dogWeight ; 
	       	  return true ;
	      }	  
	   }
	   boolean addCargo(Rock r) {
	      if (load + r.rockWeight > maxLoad) 
	          return false ;
	       else {
	       	  load += r.rockWeight ; 
	       	  return true ;
	       }	  
	   }
	   boolean addCargo(Plane p) {
	      if (load + p.weight > maxLoad) 
	          return false ;
	       else {
	       	  load += p.weight ; 
	       	  return true ;
	       }	  
	   }
	   */
	   
	}