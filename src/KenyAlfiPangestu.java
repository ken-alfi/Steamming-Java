import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeFunction.function;

public class Wahananta {
    
static Scanner input = new Scanner(System.in);


public static void main(String[] args) {
    function hapuspartikel(kata)
	{
		kata = kata.toLowerCase();
		if((kata.substr(-3) == 'kah' )||(kata.substr(-3) == 'lah' )||(kata.substr(-3) == 'pun' )){
			kata = kata.substr(0,panjangkata(kata)-3);		
		}
		return kata;  
	}
	
	function hapuspp(kata)
	{
		kata = kata.toLowerCase();
		if((kata.substr(-2) == 'ku' )||(kata.substr(-2) == 'mu' )){
			kata = kata.substr(0,panjangkata(kata)-2);		
		}else if(kata.substr(-3) == 'nya' ){
			kata = kata.substr(0,panjangkata(kata)-3);	
		}
		return kata;  
	}
	
	function hapusawalan1(kata){
		kata = kata.toLowerCase();
		if(kata.substr(0,4)=='meng'){
			if((kata.substr(4,1)=='e')||(kata.substr(4,1)=='u')){
				kata = "k"+kata.substr(4);
			}else{
				kata = kata.substr(4,panjangkata(kata));
			}
		}
		else if(kata.substr(0,4)=="meny"){
			kata = "s"+kata.substr(4);
		}
		else if(kata.substr(0,3)=="men"){
			kata = "t"+kata.substr(3);
		}
		else if(kata.substr(0,3)=="mem"){
			if(kata.substr(3,1)=="a" || kata.substr(3,1)=="i" || kata.substr(3,1)=="e" || kata.substr(3,1)=="u" || kata.substr(3,1)=="o"){
				kata = "p"+kata.substr(3);
			}
			else{
				kata = kata.substr(3);
			}
		}
		else if(kata.substr(0,2)=="me"){
			kata = kata.substr(3);
		}
		else if(kata.substr(0,4)=="peng"){
			if(kata.substr(4,1)=="e" || kata.substr(4,1)=="a"){
				kata = "k"+kata.substr(4);
			}else{
				kata = kata.substr(4);
			}
		}
		else if(kata.substr(0,4)=="peny"){
			kata = "s"+kata.substr(4);
		}
		else if(kata.substr(0,3)=="pen"){
			if(kata.substr(3,1)=="a" || kata.substr(3,1)=="i" || kata.substr(3,1)=="e" || kata.substr(3,1)=="u" || kata.substr(3,1)=="o"){
				kata = "t"+kata.substr(3);
			}else{
				kata = kata.substr(3);
			}
		}
		else if(kata.substr(0,3)=="pem"){
			if(kata.substr(3,1)=="a" || kata.substr(3,1)=="i" ||kata.substr(3,1)=="e" || kata.substr(3,1)=="u" || kata.substr(3,1)=="o"){
				kata = "p"+kata.substr(3);
			}else{
				kata = kata.substr(3);
			}
		}
		else if(kata.substr(0,2)=="di"){
			kata = kata.substr(2);
		}
		else if(kata.substr(0,3)=="ter"){
			kata = kata.substr(3);
		}
		else if(kata.substr(0,2)=="ke"){
			kata = kata.substr(2);
		}
		return kata;  
	}
	function hapusawalan2(kata){
		kata = kata.toLowerCase();
		if(kata.substr(0,3)=="ber"){
			kata = kata.substr(3);
		}else if(kata.substr(0,3)=="bel"){
			kata = kata.substr(3);
		}else if(kata.substr(0,2)=="be"){
			kata = kata.substr(2);
		}else if(kata.substr(0,3)=="per" && panjangkata(kata) > 5){
			kata = kata.substr(3);
		}else if(kata.substr(0,2)=="pe"  && panjangkata(kata) > 5){
			kata = kata.substr(2);
		}else if(kata.substr(0,3)=="pel"  && panjangkata(kata) > 5){
			kata = kata.substr(3);
		}else if(kata.substr(0,2)=="se"  && panjangkata(kata) > 5){
			kata = kata.substr(2);
		}
		return kata;
	}
	function hapusakhiran(kata){
		kata = kata.toLowerCase();
		if (kata.substr(-3)== "kan" ){
			kata = kata.substr(0,panjangkata(kata)-3);
		}
		else if(kata.substr(-1)== "i" ){
			kata = kata.substr(0,panjangkata(kata)-1);
		}else if(kata.substr(-3)== "an"){
			kata = kata.substr(0,panjangkata(kata)-2);
		}
		return kata;
	}
    
}

}