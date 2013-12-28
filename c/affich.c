/*
AFFICH.C
Ensemble de fonctions d'affichage (y'en a une :D)
Et la fonction de clean (free).
*/




#include <stdio.h>
#include <stdlib.h>
#include <SDL/SDL.h>
#include "init_sdl.h"
#include "affich.h"

//met a jour la carte et l'affiche
void affich_carte(SDL_Surface** carte, int** map, int width, int height, SDL_Surface* screen) {

	/* 
	On va afficher la map.
	0 = une case vide
	1 = une case avec de la vegetation
	2 = une case avec un herbivore
	3 = une case avec un carnivore
	
	Le code couleur sera :
	0 : noir
	1 : vert
	2 : bleu
	3 : rouge
	*/
	SDL_Rect location;	
	int i, j;
	for(i = 0; i < width; i++) {
		for(j = 0; j < height; j++) {
			if(map[i][j] == 0) {
				SDL_FillRect(carte[height*i+j], NULL, SDL_MapRGB(screen->format, 0, 0, 0));
			}
			if(map[i][j] == 1) {
				SDL_FillRect(carte[height*i+j], NULL, SDL_MapRGB(screen->format, 0, 255, 0));
			}
			if(map[i][j] == 2) {
				SDL_FillRect(carte[height*i+j], NULL, SDL_MapRGB(screen->format, 0, 0, 255));
			}
			if(map[i][j] == 3) {
				SDL_FillRect(carte[height*i+j], NULL, SDL_MapRGB(screen->format, 255, 0, 0));
			}
			location.x = i*10;
			location.y = j*10;
			SDL_BlitSurface(carte[height*i+j], NULL, screen, &location);
		}

	}
	SDL_Flip(screen);
}

//libere la memoire allouee a la carte
void free_carte(SDL_Surface** carte, int width, int height) {
	int i, j;
	for(i = 0; i < width; i++) {
		for(j = 0; j < height; j++) {
			SDL_FreeSurface(carte[height*i+j]); 
		}
	}
}
	
		
