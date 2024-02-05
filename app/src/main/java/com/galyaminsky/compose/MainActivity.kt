package com.galyaminsky.compose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                ListItem(name = "Lisander", prof = "Developer")
                ListItem(name = "Lisander", prof = "Developer")
                ListItem(name = "Lisander", prof = "Developer")
                ListItem(name = "Lisander", prof = "Developer")
                ListItem(name = "Lisander", prof = "Developer")
                ListItem(name = "Lisander", prof = "Developer")
                ListItem(name = "Lisander", prof = "Developer")
                ListItem(name = "Lisander", prof = "Developer")
                ListItem(name = "Lisander", prof = "Developer")
                ListItem(name = "Lisander", prof = "Developer")
                ListItem(name = "Lisander", prof = "Developer")
                ListItem(name = "Lisander", prof = "Developer")
            }
        }
    }
}

@Composable
private fun ListItem(name: String, prof: String) {
    var counter = remember {
        mutableStateOf(0)
    }
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .clickable {
                counter.value++
            },
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(5.dp)
    ) {
        Box {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.ava),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(64.dp)
                        .padding(10.dp)
                        .clip(CircleShape)
                )
                Column(
                    modifier = Modifier
                        .align(CenterVertically)
                        .padding(start = 10.dp)

                ) {
                    Text(counter.value.toString())
                    Text(prof)
                }
            }
        }
    }
}

