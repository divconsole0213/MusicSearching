package music;

import java.util.Scanner;

public class MusicEx {
	static int MusicInfoID = 0;
	static int numberofMusicInfo = 0;
	static MusicInfo[] m = new MusicInfo[10];
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cho = 0;

		while (cho != 3) {
			
			int type = 0;
			System.out.println("음악정보 추가, 조회 하세욤 ");
			System.out.println("정보추가(1), 정보조회(2), end(3) >> ");
            cho = sc.nextInt();
		
		
		switch(cho) {
		
		case 1 : 
			if(numberofMusicInfo >= m.length) {
				System.out.println("더 이상 음악 정보 추가 불가능합니다.^ㅡ^");
			}
			
		 if(cho < 1 || cho >3) {
			 System.out.println("잘못 입력하셨어요 다시 입력 부탁드립니다");
			 break;
		 }
		 addMusicInfo(type);
		 break;
		 
		case 2:
			for(int i=0; i<numberofMusicInfo; i++){
				m[i].MusicInfo();
				
				}
			
				break;
				case 3 :
					if(cho == 3) {
					System.out.println("프로그램 종료합니다");
				    break;
			}
		}
		}

	}


	

	private static void addMusicInfo(int type) {
	
		sc.nextLine();
		System.out.println("genre >>");
		String genre = sc.nextLine();
		//
		System.out.println("release >>");
		int release = sc.nextInt();
		//
		System.out.println("artist >>");
		String artist = sc.nextLine();
		//
		System.out.println("album>>");
		String album = sc.nextLine();
		//
		System.out.println("title");
		String title = sc.nextLine();
		//
		m[numberofMusicInfo] = new MusicInfo(genre,release,artist,album,title);
	
numberofMusicInfo++;

}


	}


