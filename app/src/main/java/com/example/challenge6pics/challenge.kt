package com.example.challenge6pics

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class HelloDosen : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            thefunc()
        }
    }
}

fun getScreenWidth(): Int {
    return Resources.getSystem().displayMetrics.widthPixels
}
fun getScreenHeight(): Int{
    return Resources.getSystem().displayMetrics.heightPixels
}

val surfaceWidth = getScreenWidth() * 0.10681
val surfaceHeight = getScreenHeight() * 0.1905

@Preview
@Composable
fun thefunc() {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            bidang1()
            bidang2()
            bidang3()
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            bidang4()
            bidang5()
            bidang6()
        }
    }
}

@Composable
fun bidang1(){
    Surface(color = Color(0xFFD3AF37),
        modifier = Modifier.size(surfaceWidth.dp,surfaceHeight.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()) {
            Image(painter = painterResource(id = R.drawable.arknights),
                contentDescription = "Gambar",
                alignment = Alignment.Center,
                modifier = Modifier.padding(8.dp)
                    .size(86.dp)
                    .clip(RoundedCornerShape(percent = 30)))

            Text(text = "Arknights",
                fontSize = 16.sp,
                color = Color.White,
                textAlign = TextAlign.Center)

            Text(text = "Strategy - Tower Defense like Game",
                fontSize = 12.sp,
                color = Color.White,
                textAlign = TextAlign.Center)
        }
    }
}

@Composable
fun bidang2(){
    Surface(color = Color(0xFF307DF0),
        modifier = Modifier.size(surfaceWidth.dp,surfaceHeight.dp)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()) {
            Image(painter = painterResource(id = R.drawable.genshinimpact),
                contentDescription = "Gambar",
                alignment = Alignment.Center,
                modifier = Modifier.padding(8.dp)
                    .size(86.dp)
                    .clip(RoundedCornerShape(percent = 30)))

            Text(text = "Genshin Impact",
                fontSize = 16.sp,
                color = Color.White,
                textAlign = TextAlign.Center)

            Text(text = "RPG - Open World Game",
                fontSize = 12.sp,
                color = Color.White,
                textAlign = TextAlign.Center)
        }
    }
}

@Composable
fun bidang3(){
    Surface(color = Color(0xFFFF4040),
        modifier = Modifier.size(surfaceWidth.dp,surfaceHeight.dp)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(painter = painterResource(id = R.drawable.honkaiimpact),
                contentDescription = "Gambar",
                alignment = Alignment.Center,
                modifier = Modifier.padding(8.dp)
                    .size(86.dp)
                    .clip(RoundedCornerShape(percent = 30)))

            Text(text = "Honkai Impact 3",
                fontSize = 16.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )

            Text(text = "RPG - Stage Game",
                fontSize = 12.sp,
                color = Color.White,
                textAlign = TextAlign.Center)
        }
    }
}

@Composable
fun bidang4(){
    Surface(color = Color(0xFFF4E4E4E),
        modifier = Modifier.size(surfaceWidth.dp,surfaceHeight.dp)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize())
        {
            Image(painter = painterResource(id = R.drawable.arterygear),
                contentDescription = "Gambar",
                alignment = Alignment.Center,
                modifier = Modifier.padding(8.dp)
                    .size(86.dp)
                    .clip(RoundedCornerShape(percent = 30)))

            Text(text = "Artery Gear: Fusion",
                fontSize = 16.sp,
                color = Color.White,
                textAlign = TextAlign.Center)

            Text(text = "RPG - Side Scroll & Turn Based Game",
                fontSize = 12.sp,
                color = Color.White,
                textAlign = TextAlign.Center)
        }
    }
}

@Composable
fun bidang5(){
    Surface(color = Color(0xFF79CDCD),
        modifier = Modifier.size(surfaceWidth.dp,surfaceHeight.dp)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize())
        {
            Image(painter = painterResource(id = R.drawable.tof),
                contentDescription = "Gambar",
                alignment = Alignment.Center,
                modifier = Modifier.padding(8.dp)
                    .size(86.dp)
                    .clip(RoundedCornerShape(percent = 30)))

            Text(text = "Tower of Fantasy",
                fontSize = 16.sp,
                color = Color.White,
                textAlign = TextAlign.Center)

            Text(text = "similar to Genshin Impact but MMO",
                fontSize = 12.sp,
                color = Color.White,
                textAlign = TextAlign.Center)
        }
    }
}

@Composable
fun bidang6(){
    Surface(color = Color(0xFF03C03C),
        modifier = Modifier.size(surfaceWidth.dp,surfaceHeight.dp)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize())
        {
            Image(painter = painterResource(id = R.drawable.projectsekai),
                contentDescription = "Gambar",
                alignment = Alignment.Center,
                modifier = Modifier.padding(8.dp)
                    .size(86.dp)
                    .clip(RoundedCornerShape(percent = 30)))

            Text(text = "Project Sekai: Colorful Stage",
                fontSize = 16.sp,
                color = Color.White,
                textAlign = TextAlign.Center)

            Text(text = "Rythim Game - Similar to OSU",
                fontSize = 12.sp,
                color = Color.White,
                textAlign = TextAlign.Center)
        }
    }
}