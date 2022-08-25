public class GenomicRangeQuery {
    public static void main(String[] args) {
        int[] P = {1};
        int[] Q = {1};
        for(int i : solution("CTTCCTA", P, Q))
            System.out.println(i);
    }

    private static int[] solution(String S, int[] P, int[] Q) {
      int[][] lookup = new int[S.length()][4];
      for(int i = 0;i < S.length();i++) {
        switch(S.charAt(i)) {
          case 'A': 
            lookup[i][0]++;
            break;
          case 'C':
            lookup[i][1]++;
            break;
          case 'G':
            lookup[i][2]++;
            break;
          default:
            lookup[i][3]++;
        }
      }

      for(int i = 1;i < lookup.length;i++) {
        for(int j = 0;j < lookup[i].length;j++) {
          lookup[i][j] += lookup[i - 1][j];
        }
      }

      int[] results = new int[P.length];
      for(int i = 0;i < P.length;i++) {
        if(P[i] == Q[i]) {
          switch(S.charAt(P[i])) {
            case 'A': 
            results[i] = 1;
            break;
          case 'C':
            results[i] = 2;
            break;
          case 'G':
            results[i] = 3;
            break;
          default:
            results[i] = 4;
          }
          continue;
        }

        for(int j = 0;j < 4;j++) {
          int subtract = P[i] - 1 > 0 ? lookup[P[i] - 1][j] : 0;
          if(lookup[Q[i]][j] - subtract > 0) {
            results[i] = j + 1;
            break;
          }
        }
      }

      return results;
    }
}
