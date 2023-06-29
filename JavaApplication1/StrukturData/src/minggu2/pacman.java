package minggu2;
public class pacman {
int xe, ye, width, height;
int left=0,right=0,up=0,down=0;
pacman(){
}
pacman (int x, int y, int w, int h){
    xe=x;
    ye=y;
    width=w;
    height=h;
    
}

void moveleft(){
    if(xe>0&&xe<=width){
        left=xe-1;
    }else{
        left=xe;
    }
}
void moveright(){
    if(xe>0&&xe<=width){
        right=xe+1;
    }else{
        right=xe;
    }
}
void moveup(){
    if(ye>0&&ye<=height){
        up=ye-1;
    }else{
        up=ye;
    }
}
void movedown(){
    if(ye>0&&ye<=height){
        up=ye+1;
    }else{
        up=ye;
    }
}
void printPosition(){
    System.out.println
       ("Posisi x     : " + xe + "\n" +
        "Posisi y     : " + ye + "\n" +
        "Lebar        : " + width + "\n" +
        "Panjang      : " + height + "\n" +
        "======================================" + "\n" +
        "Posisi bergeser ke kiri menjadi  : " +left+"\n" +
        "Posisi bergeser ke kanan menjadi : " +right+"\n" +
        "Posisi bergeser ke atas menjadi  : " +up+"\n" +
        "Posisi bergeser ke bawah menjadi : " +down+"\n");
}       
}
