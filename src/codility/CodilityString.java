package codility;



public class CodilityString {
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();

		sb.append("my.song.mp3 11b" + "\n");
		sb.append("greatSong.flac 1000b" + "\n");
		sb.append("not3.txt 5b" + "\n");
		sb.append("video.mp4 200b" + "\n");
		sb.append("game.exe 100b" + "\n");
		sb.append("mov!e.mkv 10000b");

		System.out.print(solution(sb.toString()));
	}

	public static String solution(String S){

		String[] newone = S.split("\n");
		int music = 0;
		int images = 0;
		int movies = 0;
		int other = 0;
		int lenght = newone.length;
		for(int x = 0; x < lenght; x++) {
			String[] item = newone[x].split(" ");
			String[] extension = item[0].split("\\.");
			String finalExtension = extension[extension.length - 1];
			String[] size = item[1].split("b");
			String finalSize = size[0];
			
			
			if(finalExtension.equalsIgnoreCase("mp3") || finalExtension.equalsIgnoreCase("aac")|| finalExtension.equalsIgnoreCase("flac")) {
				music += Integer.parseInt(finalSize);
			}
			else if(finalExtension.equalsIgnoreCase("jpg") || finalExtension.equalsIgnoreCase("bmp")|| finalExtension.equalsIgnoreCase("gif")) {
				images += Integer.parseInt(finalSize);
			}
			else if(finalExtension.equalsIgnoreCase("mp4") || finalExtension.equalsIgnoreCase("avi")|| finalExtension.equalsIgnoreCase("mkv")) {
				movies += Integer.parseInt(finalSize);
			} else {
				other += Integer.parseInt(finalSize);
			}
			
		}
		
		
		S = ("music " + music + "b\n" + "images " + images + "b\n" + "movies " + movies + "b\n" + "other " + other +"b");
		
		
		
		
		return S;
	}
}

