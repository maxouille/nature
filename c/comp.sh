#compilation du truc.
#TODO makefile
gcc -Wall main.c affich.c init_sdl.c `sdl-config --cflags --libs`

