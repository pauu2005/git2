package git2;
import java.util.Random;

public class parte1 {
public static void main(String [] args) {
	char [] [] matriz = {
			{' ', ' ', ' ', ' ', ' '},
			{' ', ' ', ' ', ' ', ' '},
			{' ', ' ', ' ', ' ', ' '},
			{' ', ' ', ' ', ' ', ' '},
			{' ', ' ', ' ', ' ', ' '}
	
	};
Random random = new Random();

int filas = 5;
int columnas = 5;


for (int i = 0; i < 5; i++) {
for (int j = 0; i < 5; j++) {
	
	System.out.print( matriz[i][j]);
	if (j < 5)System.out.print("|");
	if (i < 5)System.out.print("----------------");
	
	
	
	
	
}



	
	}
}
}
