class Palindrom{
	public static void main(String[] args){
		new Palindrom().palindrome("kasur ini rusak");		
	}
	
	private void palindrome(String teks){		
		String poli = "";					
		for(int i=teks.length()-1; i>-1; i--){
			char c = teks.charAt(i);			
			poli += String.valueOf(c);
		}
		
		if(teks.equals(poli)){
			System.out.println("==== "+teks+" adalah Palindrome =====");
		}else{
			System.out.println("==== "+teks+" bukan Palindrome =====");
		}
	}
}
