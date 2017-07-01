		package 人口普查;
		
		import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
		
		class man {
			String name;
			String date;
			Long d;
			String s1 = "";
		
			// String s[]=date.split("/");
			public man(String name, String date) {
				this.name = name;
				this.date = date;
			}
		
			public void to() {
				date = date.replaceAll("/", "");
				// for(int i=0;i<s.length;i++){
				// s1+=s[i];
				// }
				d = Long.parseLong(date);
			}
		}
		
		public class Main {
			public static void main(String[] args) throws IOException {
				BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			
				int n = Integer.parseInt(bf.readLine());
				
				man m[] = new man[100005];
				for (int i = 0; i < n; i++) {
					String s[]=bf.readLine().split("\\s");
					m[i] = new man(s[0], s[1]);
					m[i].to();
				}
				bf.close();
				long min = 20140906;
				long max = 18140906;
				int m1 = 0;
				int n1 = 0;
				int count = 0;
				for (int i = 0; i < n; i++) {
					if (m[i].d >= 18140906 && m[i].d <= 20140906) {
						count++;
						if (m[i].d < min) {
							min = m[i].d;
							n1 = i;
						}
						if (m[i].d > max) {
							max = m[i].d;
							m1 = i;
						}
					}
				}
				System.out.print(count + " " + m[n1].name + " " + m[m1].name);
			}
		
		}
