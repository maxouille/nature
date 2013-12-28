/*
init_sdl.c

demarre l'ecran (screen) et fait des affichages test.
TODO : fusionner ça avec affich.c
retirer les tests quand le moment sera venu

*/





#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <SDL/SDL.h>
#include "init_sdl.h"
#include "affich.h"


int init_sdl(int x_size, int y_size, int** map) {
	
	SDL_Surface* screen = NULL;

	//creation de la fenetre
	screen = SDL_SetVideoMode(10*x_size,10*y_size,32,SDL_HWSURFACE | SDL_RESIZABLE | SDL_DOUBLEBUF);
	if(screen == NULL) {
		fprintf(stderr,"ERROR SDL_SetVideoMode:%s\n", SDL_GetError());
		exit(EXIT_FAILURE);
	}	
	SDL_WM_SetCaption("Biosphere", NULL);


	SDL_Surface* carte[x_size][y_size];
	int i, j, k;
	for(i = 0; i < x_size; i++) {
		for(j = 0; j < y_size; j++) {
			carte[i][j] = SDL_CreateRGBSurface(SDL_HWSURFACE, 10, 10, 32, 0, 0, 0, 0);
		}
	}
	for(k = 0; k < 1000; k++) {
		affich_carte(&carte[0][0], map, x_size, y_size, screen); 	
		for(i = 0; i < 64; i++) {
			for(j = 0; j < 48; j++) {
				map[i][j] = rand()%4;
			}
		}
	}

	free_carte(&carte[0][0], x_size, y_size);

	//fin de la SDL
	SDL_Quit();

	return EXIT_SUCCESS;
}
