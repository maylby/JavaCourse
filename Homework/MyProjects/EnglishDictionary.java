/*
На основе приведённого ниже кода, написать программу,
которая собирает в сети английские слова 
и сортирует их в алфавитном порядке.
 */

package JavaHomework.MyProjects;
/*    
Метод, который находит самый длинный общий префикс 
среди массива строк. 
Если общего префикса нет, возвращает пустую строку.
 */
public class EnglishDictionary {
    public static void main(String[] args) {
		String[] strs = {"flower", "flow", "flood", "float", "flight"};
		String pref = getLongestPrefix(strs);
		System.out.print(pref);
	}

    private static String getLongestPrefix(String[] strs) {
        String pref = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(pref) != 0) {
				pref = pref.substring(0, pref.length()-1);
			}
			if (pref.isEmpty()) break; 
		}
        return pref;
    }
}
