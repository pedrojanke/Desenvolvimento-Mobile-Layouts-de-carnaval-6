package com.example.layoutscarnaval6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookDetailsScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookDetailsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBar(
            title = { Text(text = "Book Store", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color(0xFF3F51B5))
        )

        Spacer(modifier = Modifier.height(20.dp))


        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "The Silkworm", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text(text = "Robert Galbraith", fontSize = 18.sp, color = Color.Gray)
        Text(text = "June 19, 2014", fontSize = 16.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF007BFF))
        ) {
            Text(text = "BUY", fontSize = 18.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            RatingBadge()
            Text(text = "More & Trailers", fontSize = 14.sp, color = Color.Gray)
            Text(text = "Similar", fontSize = 14.sp, color = Color.Gray)
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Private investigator Cormoran Strike returns in a new mystery from Robert Galbraith, " +
                    "author of the #1 international bestseller The Cuckoo's Calling.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextButton(onClick = { }) {
            Text(text = "READ MORE", fontSize = 16.sp, color = Color(0xFF007BFF))
        }
    }
}

@Composable
fun RatingBadge() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "4.0", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
        Text(text = "717", fontSize = 14.sp, color = Color.Gray)
    }
}

@Composable
fun IconBadge(iconId: Int, text: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            painter = painterResource(id = iconId),
            contentDescription = null,
            modifier = Modifier.size(40.dp),
            tint = Color(0xFF007BFF)
        )
        Text(text = text, fontSize = 14.sp, color = Color.Gray)
    }
}
