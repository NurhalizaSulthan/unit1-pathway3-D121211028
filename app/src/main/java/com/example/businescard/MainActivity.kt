package com.example.businescard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.businescard.ui.theme.BusinesCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinesCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard ()
                }
            }
        }
    }
}

@Composable
fun BusinessCard () {
    Column (
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color(0xFFD34949)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val image = painterResource(id = com.example.businescard.R.drawable.logo_resmi_unhas_1)
        Image(
            painter = image,
            contentDescription = "Android Logo",
            modifier = Modifier
                .height(125.dp)
                .width(155.dp)
        )
        Text(text = "Siti Nurhaliza", color = Color.White, fontSize = 32.sp)
        Text(text = "Student Of Hasanuddin University", color = Color(0xFFFFEB3B))
    }
    Column(
        modifier = Modifier

            .fillMaxWidth()
            .padding(top = 600.dp)
            .padding(bottom = 70.dp)
            .padding(start = 16.dp)
            .padding(end = 16.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
                .padding(bottom = 3.dp),

            ){
            val icon = painterResource(id = com.example.businescard.R.drawable.baseline_local_phone_24)
            Icon(
                painter = icon,
                contentDescription = null,
                modifier = Modifier.padding(start = 60.dp),
                Color(0xFFFFEB3B)
            )
            Text(text = "085294269642", modifier = Modifier.padding(start = 15.dp),color = Color.White)

        }
        Row(
            modifier = Modifier

                .fillMaxWidth()
                .padding(start = 10.dp)
                .padding(bottom = 3.dp),

        ){
            val icon2 = painterResource(id = com.example.businescard.R.drawable.baseline_share_24)
            Icon(painter = icon2,
                contentDescription = null,
                modifier = Modifier.padding(start = 60.dp),
                Color(0xFFFFEB3B)
            )
            Text(text = "@Bungins", modifier = Modifier.padding(start = 15.dp),color = Color.White)
        }
        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 10.dp),
        ){
            val icon3 = painterResource(id = com.example.businescard.R.drawable.baseline_email_24)
            Icon(painter = icon3,
                contentDescription = null,
                modifier = Modifier.padding(start = 60.dp),
                Color(0xFFFFEB3B)
            )
            Text(text = "sitinurhaliza@gmail.com", modifier = Modifier.padding(start = 15.dp),color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinesCardTheme {
        Surface{
            BusinessCard()
        }
    }
}