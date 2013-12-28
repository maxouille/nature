/*
main.c
initialisation de la bibliothèque SDL, création de la map, et appel d'init_sdl pour démarrer l'ecran d'affichage
(et puis test de cet ecran pour le moment)
*/



#include <stdio.h>
#include <stdlib.h>
#include <SDL/SDL.h>
#include <time.h>
#include "init_sdl.h"
#include "affich.h"


int main(int argc, char* argv[]) {



	//initialisation de la SDL
	if(SDL_Init(SDL_INIT_VIDEO) == -1) {
		fprintf(stderr, "ERROR SDL_Init\n");
		exit(EXIT_FAILURE);
	}
	//////////////////////////////

	srand(time(NULL));
	int i, j;
	int** map = malloc(64*sizeof(int*));
	for(i = 0; i < 64; i++) {
		map[i] = malloc(48*sizeof(int));
	}
	for(i = 0; i < 64; i++) {
		for(j = 0; j < 48; j++) {
			map[i][j] = rand()%4;
		}
	printf("\n");
	}
	init_sdl(64, 48, map);
	return 0;
}
