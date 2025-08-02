package practicalTasks;

class Student{
	String name;
	int roll_no;
	int[] marks;
//	public String getName() {
//		return name;
//	}
//	public int getRoll_no(){
//		return roll_no;
//	}
//	public int[] getMarks() {
//		return marks;
//	}
	public void setName(String name){
		this.name=name;
		System.out.println("ns");
	}
	public void setRoll_no(int roll_no) {
		this.roll_no=roll_no;
		System.out.println("rns");
	}
	public void setMarks(int[] marks) {
		this.marks=marks;
		System.out.println("ms");
	}
	public void getters() {
		System.out.println(name);
		System.out.println(roll_no);
		for (int mark:marks) {
		System.out.println(mark);}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] marksa= {20,12,234,45};
//      System.out.println("about to start constructor");
         Student s=new Student();
//      s.display();
      System.out.println("start setting");
      s.setName("Rugvedh");
      s.setRoll_no(9);
      s.setMarks(new int[] {23,24,25});
      s.getters();
	}
}
