package com.ezen01;

import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {
    private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();

    // name 이름을 갖고 있는 포켓몬을 모두 가져오는 메소드
    public ArrayList<Pokemon> getPokemons(String name) {
    	return pokemons.get(name);
    }

    // HashMap pokemons에 객체 Pokemon을 넣는 메소드.
    public void add(Pokemon pokemon) {
    	String name = pokemon.name;
    	
    	if(getPokemons(name) == null) {
    		pokemons.put(name, new ArrayList<Pokemon>());
    	}
    	getPokemons(name).add(pokemon);
    }
    
    // name 이름의 포켓몬 중 가장 강한(cp가 큰) 포켓몬을 가져오는 메소드.
    public Pokemon getStrongest(String name) {
    	ArrayList<Pokemon> pokemonList = getPokemons(name);
    	if (pokemonList == null) {
    		return null;
    	}
    	Pokemon strongest = null;
    	for (Pokemon pokemon : pokemonList) {
    		if (strongest == null || pokemon.cp > strongest.cp) {
    			strongest = pokemon;
    		}
    	}
    	return strongest;
    }

    // 내가 가진 포켓몬 중 가장 강한 포켓몬을 가져오는 메소드. 
    // 위의 메소드를 호출하도록.
    public Pokemon getStrongest() {
    	Pokemon strongest = null;
    	for (String key : pokemons.keySet()) {
    		Pokemon p = getStrongest(key);
    		if (strongest == null || p.cp > strongest.cp) {
    			strongest = p;
    		}
    	}
    	return strongest;
    }
}