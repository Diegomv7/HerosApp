package com.example.heroesapp.models

import java.util.Locale.Category

data class Heroes(val idPublisher: Int,val name: String, val imgen: String){
    companion object {
        val Heroes = mutableListOf<Heroes>(
            Heroes(2,"Capitan America", "https://i.pinimg.com/originals/bd/c7/72/bdc772a541afa4c7049b5245d7364747.png"),
            Heroes(2,"Ironman", "https://i.pinimg.com/originals/4b/af/a3/4bafa358508ab35e35a2f61e3f2d4cda.png"),
            Heroes(2,"Hulk", "https://static.wikia.nocookie.net/outlier-battles/images/d/d1/Open-uri20150608-27674-1jdbpa8_be64ca1b.png/revision/latest?cb=20180607072306"),
            Heroes(2,"Hawkeye", "https://static.wikia.nocookie.net/marvelvscapcomespaol/images/9/9a/Hawkeye-UMvC3.png/revision/latest?cb=20170903005042&path-prefix=es"),
            Heroes(2,"Blackwidow", "https://static.wikia.nocookie.net/character-level/images/9/9a/QDNpnla.png/revision/latest/scale-to-width-down/400?cb=20190528001733"),
            Heroes(2,"Spider-Man", "https://beyondamazingexhibition.com/assets/img/hero/hero-spiderman.bec7418a.png"),
            Heroes(1,"Batman", "https://static.dc.com/2022-08/DC_BMDHub_RegBanner_BM1.png?w=700"),
            Heroes(1,"Flash", "https://upload.wikimedia.org/wikipedia/en/b/b7/Flash_%28Barry_Allen%29.png"),
            Heroes(1,"Aquaman", "https://static.wikia.nocookie.net/death-battle-fanon-wiki-en-espanol/images/8/84/Aquaman.png/revision/latest?cb=20190918015708&path-prefix=es"),
            Heroes(1,"Superman", "https://i.pinimg.com/originals/6e/70/a7/6e70a702b7d8adb6b7e6de17b894d742.png"),
            Heroes(1,"Wonder Woman", "https://i.pinimg.com/originals/83/12/0c/83120c80ece721197bae0c0ca6ab92bf.png"),
            Heroes(1,"Linterna Verde", "https://i.pinimg.com/originals/b1/91/d2/b191d20ac0d5173ab50c0f9b16fcc604.png")



        )
    }
}
