package pck.abstraction.search;

public class VideoSearch extends Google  {
	public void search()
	{
		System.out.println("Abstract method from VideoSearch");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
VideoSearch objVideo=new VideoSearch();
objVideo.search();
objVideo.display();
	}

}
