package com.campusdual.classroom;

public class Exercise18 {

	public static void main(String[] args) {
	createAndInitializeArray(5);
	int[] arrayPrueba={1,2,3,4};
	showInlineArray(arrayPrueba);

	}

	public static int[] createAndInitializeArray(int num){
		int[] array = new int[num];
		for(int i=0;i<array.length;i++){
			array[i]=i+1;
		}

		return array;
	}

	public static void showInlineArray(int[] arrayEntero){
		String resultado=new String();
		for(int i=0;i<arrayEntero.length;i++){
			if(i==arrayEntero.length-1){
				resultado+=(i+1);
			}else{
				resultado+=(i+1)+" ";
			}

		}
		System.out.println(resultado);
	}


}
