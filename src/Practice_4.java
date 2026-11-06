import java.util.List;

public class Practice_4 {

    public  static void main(String[] args) {
        class Matrix{
            private int dimension; // размер матрицы
            private int[][] matrix;

            public Matrix(int n){
                dimension = n;
                matrix = new int[n][n];
            }

            public int[][] fillRandom(){ // матрица заполненная рандомными числами
                for(int i = 0; i < dimension; i++){
                    for(int j = 0; j < dimension; j++){
                        matrix[i][j] = (int)(Math.random() * 10);
                    }
                }
                return matrix;
            }

            public int[][] fillN(int n){ // матрица заполненная числом n
                for(int i = 0; i < dimension; i++){
                    for(int j = 0; j < dimension; j++){
                        matrix[i][j] = n;
                    }
                }
                return matrix;
            }

            public int[][] fillList(List<Integer> list){ // матрица заполненная циклической последовательностью цифр
                int iterator = 0;
                for(int i = 0; i < dimension; i++){
                    for(int j = 0; j < dimension; j++){
                        if (iterator >= list.size()){
                            iterator = 0;
                        }
                        matrix[i][j] = list.get(iterator++);
                    }
                }
                return matrix;
            }

            public int[][] fillIdentity(){ // единичная матрица
                for(int i = 0; i < dimension; i++){
                    for(int j = 0; j < dimension; j++){
                        matrix[i][j] = (i == j ? 1 : 0);
                    }
                }
                return  matrix;
            }

            public int fillTrace(){ // след матрицы
                int trace = 0;
                for(int i = 0; i < dimension; i++){
                    trace += matrix[i][i];
                }
                return trace;
            }

            public  int[][] fillTransposition(){
                for(int i = 0; i < dimension; i++){
                    for(int j = 0; j < i; j++){
                        int tmp =  matrix[i][j];
                        matrix[i][j] = matrix[j][i];
                        matrix[j][i] = tmp;
                    }
                }
                return  matrix;
            }

            public String preparePresentation(){
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < dimension; i++){
                    for(int j = 0; j < dimension; j++){
                        sb.append(matrix[i][j]).append(" ");
                    }
                    sb.append("\n");
                }
                return sb.toString();
            }

        }
        Matrix a = new Matrix(4);
        a.fillRandom();
        System.out.println(a.preparePresentation());
    }
}
