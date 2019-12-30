package happy;

 class OuterClass {
   void outerMethod()
   {
	   System.out.println("from outer");
   }
   class inner{
	   void innerMethod()
	   {
		   System.out.println();
	   }
   }
}

public class TestInnerClass{
	public static void main(String[] args) {
		TestInnerClass outerObj=new TestInnerClass();
		outerObj.outerMethod();
		OuterClass.inner innerObj = new OuterClass.inner();
		innerObj.innerMethod();
	}
}
