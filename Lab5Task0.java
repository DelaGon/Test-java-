class Lab5Task0B{
	public static void main(String[] args){
		Language english = new Language(21, 5);
		Language arabic = new Language(29, 0);
		System.out.println(english.getConsonants());
		System.out.println(english.getVowels());
		System.out.println(arabic.getConsonants());
		System.out.println(arabic.getVowels());
	}
}