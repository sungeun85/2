public class Sol16 {

	public static void main(String[] args) {
		int[][]score ={{ 100, 100, 100}
						,{20,20,20}
						,{30,30,30}
						,{40,40,40}
						,{50,50,50}};
		
			int koreanTotal = 0;
			int englishTotal = 0;
			int mathTotal = 0;
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("i\tj\tscore[i][0]\tscore[i][1]\tscore[i][2]\tscore[i][j]\t\tsum\tkoreanTotal\tenglishTotal\tmathTotal");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
			
			for(int i=0;i<score.length;i++) {
				
				int sum = 0;
				koreanTotal += score[i][0];
				englishTotal += score[i][1];
				mathTotal += score[i][2];
			
				for(int j=0;j<score[i].length;j++) {
					
					sum+=score[i][j];
					System.out.println(i+"\t"+j+"\t"+"\t"+score[i][0]+"\t\t"+score[i][1]+"\t\t"+score[i][2]+"\t\t"+score[i][j]+"\t\t"+sum+"\t"+koreanTotal+"\t\t"+englishTotal+"\t\t"
							+mathTotal);
				}
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
		}
}