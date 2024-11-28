#include <graphics.h>
#include <conio.h>
main()
{
    int gd=DETECT,gm;
    initgraph(&gd,&gm,NULL);
    setbkcolor(CYAN);
    getch();
    closegraph();
}

