
public class Ejercicio3 {
    public static void main(String[] args) {

        /*Apartado A */
        float Resultado_A=3.0f/2.0f + 4.0f/3.0f ;
        /* Apartado B  */
        float x=0f;
        float y=0f;
        float Resultado_B;
        Resultado_B=1.0f/x-5.0f - (3.0f*x*y)/4.0f;
        /*Apartado C */
        float Resultado_C=1.0f/2.0f+7.0f;
        /*Apartado D */
        float Resultado_D=7.0f+1.0f/2.0f;
        /*Apartado E */
        double Resultado_E=0,a=2,b=1,c=1,d=1,e=1,f=1,g=1,h=1,j=1;
        double potencia;
        potencia=Math.pow(a, 2);
        Resultado_E=(potencia/b-c)+((d-e)/((f-(g+h))/j));

        /*Apartado F */
        double m=1,n=1,p=1,Resultado_F;
        Resultado_F= (m/n)+p;
        /*Apartado G */
        double q=1,Resultado_G;
        Resultado_G=m+(n/p-q);
        /*Apartado H */
        double Resultado_H,pot1=0,pot2=0,pot3=0,pot4=0;
        pot1=Math.pow(a, 2);
        pot2=Math.pow(b, 2);
        pot3=Math.pow(c, 2);
        pot4=Math.pow(d, 2);

        Resultado_H=(pot1/pot2)+(pot3/pot4);

        /*Apartado I */
        double Resultado_I,r=1,s=1;

        Resultado_I=(m+n/p)/(q-r/s);

        /*Apartado J */

        double Resultado_J;
        Resultado_J=(3.0*a+b)/(c-(d+5.0*e)/(f+(g/2.0*h)));
        /*Apartado K */
        double Resultado_K;
        Resultado_K=(pot1+(2*a*b)+pot2)/((1/x*x)+2);

        System.out.println("A: "+Resultado_A);
        System.out.println("B: "+Resultado_B);
        System.out.println("C: "+Resultado_C);
        System.out.println("D: "+Resultado_D);
        System.out.println("E: "+Resultado_E);
        System.out.println("F: "+Resultado_F);
        System.out.println("G: "+Resultado_G);
        System.out.println("H: "+Resultado_H);
        System.out.println("I: "+Resultado_I);
        System.out.println("J: "+Resultado_J);
        System.out.println("K: "+Resultado_K);
    }
}
