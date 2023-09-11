package com.aamirashraf.mutablestates

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun notificationPreview(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        notificationInc()
    }
}

@Composable
fun notificationInc(){
    var c:MutableState<Int> = rememberSaveable{ mutableStateOf(0) }
    //rememberSaveable can handle the configuration changes
    //remember can only handle the simple click
    //it only store the primitive values
    //for other values we need to use serialisable and parcelable

    Column(verticalArrangement = Arrangement.Center) {
        Text(text = "Counter is ${c.value}")
        Button(onClick = {
            c.value++

        }) {
            Text(text = "Inc")
        }
    }
}