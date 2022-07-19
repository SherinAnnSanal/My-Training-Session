package pck.abstraction.search;

public class imageSearch extends Google{
	public void search()
	{
		System.out.println("Abstract class method from Google");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
imageSearch objImage=new imageSearch();
objImage.search();
	}

}
