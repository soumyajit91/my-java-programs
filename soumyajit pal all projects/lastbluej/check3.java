package lastbluej;


class check3
 {
     int fun(int a, int b) {
 return((b != 0)?(a * fun(a, b - 1)):1);
 }
}
