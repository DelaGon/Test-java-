class Language{
    private int Consonants;
    private int Vowels; 
    Language(int c,int v){ 
		this.Consonants = c;
		this.Vowels = v;
	}
	public int getConsonants(){ 
		return this.Consonants;
	}
	public int getVowels(){ 
		return this.Vowels;
	}
	public String toString(){
    	return this.Consonants+" consonants,"+this.Vowels+" vowels, total "+(this.Consonants+this.Vowels)+" letters";
	}
	public boolean hasNoVowels(){
		return this.Vowels == 0; 
	}
}