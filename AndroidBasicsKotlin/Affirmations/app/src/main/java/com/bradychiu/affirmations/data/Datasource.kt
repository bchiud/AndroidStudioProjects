package com.bradychiu.affirmations.data

import com.bradychiu.affirmations.R
import com.bradychiu.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.afffirmation1, R.drawable.image1),
            Affirmation(R.string.afffirmation2, R.drawable.image2),
            Affirmation(R.string.afffirmation3, R.drawable.image3),
            Affirmation(R.string.afffirmation4, R.drawable.image4),
            Affirmation(R.string.afffirmation5, R.drawable.image5),
            Affirmation(R.string.afffirmation6, R.drawable.image6),
            Affirmation(R.string.afffirmation7, R.drawable.image7),
            Affirmation(R.string.afffirmation8, R.drawable.image8),
            Affirmation(R.string.afffirmation9, R.drawable.image9),
            Affirmation(R.string.afffirmation10, R.drawable.image10),
        )
    }
}