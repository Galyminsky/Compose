package com.galyaminsky.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import com.galyaminsky.compose.ui.theme.Blue100

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Blue100),

                ) {
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.ava, "Lisander", "fghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjksfghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjks"),
                        ItemRowModel(R.drawable.ava1, "Oleg","fghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjksfghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjks"),
                        ItemRowModel(R.drawable.ava2, "Baukmod","fghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjksfghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjks"),
                        ItemRowModel(R.drawable.ava3, "Alex","fghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjksfghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjks"),
                        ItemRowModel(R.drawable.ava4, "Sahsa","fghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjksfghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjks"),
                        ItemRowModel(R.drawable.ava5, "Misha","fghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjksfghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjks"),
                        ItemRowModel(R.drawable.ava6, "Tatyana","fghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjksfghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjks"),
                        ItemRowModel(R.drawable.ava7, "Ivan","fghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjksfghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjks"),
                        ItemRowModel(R.drawable.ava9, "Maks","fghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjksfghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjks"),
                        ItemRowModel(R.drawable.ava10, "Andrew","fghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjksfghskfjhgksjfhglsfhglkjsfhgjkhsfkjghskljflgkjsfhgjklsfjghskjfhgkjshfgjks"),
                    )
                ) { index, item ->
                    MyRow(item = item)
                }
            }
        }
    }
}


