package com.bignerdranch.android.laba1_chusov

import android.content.Intent
import android.os.Bundle
import android.widget.CalendarView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.bignerdranch.android.laba1_chusov.ui.theme.*

class CalendarActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laba1_ChusovTheme { val context = LocalContext.current
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MyGreenLight
                ) {
                    Row(

                    )
                    {

                        androidx.compose.material.Text(
                            text = stringResource(R.string.kal),
                            color = Color.White,
                            fontSize = 27.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.offset(x = 15.dp, y = 12.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.avatar),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(60.dp)
                                .offset(x = 190.dp, y = 5.dp). clickable(onClick =

                        {
                            val intent = Intent(context, ProfileActivity::class.java)
                            startActivity(context,intent, null)
                        }))
                    /*Greeting("Android")*/
                    }
                }
                Calendar()
                BottomPanel2()
            }
        }
    }
}

@Composable
fun Calendar(){
    AndroidView({ CalendarView(it) },
        modifier = Modifier
            .wrapContentWidth()
            .offset(x = 25.dp, y = 100.dp),
        update = {
                views ->
            views.setOnDateChangeListener{calendarView, year, month, dayOfMonth ->

            }
        })
}

@Composable
fun BottomPanel2() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center)
            .offset(y = 580.dp)
    ) {
        Box(
            modifier = Modifier
                .size(320.dp, 80.dp)
                .shadow(
                    10.dp,
                    RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 30.dp,
                        bottomEnd = 0.dp,
                        bottomStart = 0.dp,
                    )
                )
                .clip(
                    RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 30.dp,
                        bottomEnd = 0.dp,
                        bottomStart = 0.dp,
                    )
                )
                .background(pan),
        ) {
            Row(modifier = Modifier.padding(all = 8.dp)) {
                Column(modifier = Modifier.padding(start = 24.dp, top = 8.dp)) {
                    Image(
                        painter = painterResource(R.drawable.redlist),
                        contentDescription = "list",
                        modifier = Modifier
                            .size(40.dp).clickable(onClick =
                            {
                                /*val intent = Intent(context, ::class.java)
                                startActivity(context,intent, null)*/
                            })
                    )
                    androidx.compose.material.Text(
                        text = "list",
                        color = Red1,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center),
                        fontSize = 10.sp
                    )
                }
                Column(modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                    Image(

                        painter = painterResource(R.drawable.alarm),
                        contentDescription = "Alarm",
                        modifier = Modifier
                            .size(40.dp).clickable(onClick =
                            {
                                val intent = Intent(context, AlarmActivity::class.java)
                                startActivity(context,intent, null)

                            })

                    )
                    androidx.compose.material.Text(
                        text = "Alarm",
                        color = Color.Red,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center),
                        fontSize = 10.sp
                    )
                }
                Column(modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                    Image(
                        painter = painterResource(R.drawable.greencal),
                        contentDescription = "List",
                        modifier = Modifier
                            .size(40.dp)

                    )
                    androidx.compose.material.Text(
                        text = "Calendar",
                        color = settings,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center),
                        fontSize = 10.sp
                    )
                }
                Column(modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                    Image(
                        painter = painterResource(R.drawable.settings),
                        contentDescription = "Settings",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable(onClick =
                            {
                                val intent = Intent(context, SettingsActivity::class.java)
                                startActivity(context,intent, null)
                            })
                    )
                    androidx.compose.material.Text(
                        text = "Settings",
                        color = Color.Red,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center),
                        fontSize = 10.sp
                    )
                }
            }
        }
    }
}