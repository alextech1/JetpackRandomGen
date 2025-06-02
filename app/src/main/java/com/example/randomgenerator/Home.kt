package com.example.randomgenerator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.randomgenerator.ui.theme.GreenJC
import kotlin.random.Random
import kotlin.random.nextInt

private var concat: Set<Int> = emptySet()
private var listHasValues: Boolean = false

/*NOTE: Disadvantage of Jetpack, cannot make buttons within a button that generates buttons*/
@Composable
fun Home() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            val randomNumbers = generateSequence {
                Random.nextInt(1..70)
            }.distinct().take(5).sorted().toSet()
            /*val randomNumbers2 = generateSequence {
                Random.nextInt(1..70)
            }.distinct().take(5).sorted().toSet()
            val randomNumbers3 = generateSequence {
                Random.nextInt(1..70)
            }.distinct().take(5).sorted().toSet()
            val randomNumbers4 = generateSequence {
                Random.nextInt(1..70)
            }.distinct().take(5).sorted().toSet()
            val randomNumbers5 = generateSequence {
                Random.nextInt(1..70)
            }.distinct().take(5).sorted().toSet()*/

            concat = concatenate(
                randomNumbers,
                /*randomNumbers2,
            randomNumbers3,
            randomNumbers4,
            randomNumbers5*/
            )



            if (listHasValues) {
                for (i in concat) {
                    OutlinedButton(
                        onClick = { /*Todo*/ },
                        modifier = Modifier.padding(horizontal = 3.dp)
                    ) {
                        Text(text = "$i", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    }
                }
            } else {
                println("none")
            }
        }
    }
}

private fun concatenate(
    randomNumbers: Set<Int>,
    /*randomNumbers2: Set<Int>,
    randomNumbers3: Set<Int>,
    randomNumbers4: Set<Int>,
    randomNumbers5: Set<Int>*/
): Set<Int> {
    listHasValues = true
    return randomNumbers //+ randomNumbers2 + randomNumbers3 + randomNumbers4 + randomNumbers5
}