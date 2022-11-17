package com.bignerdranch.android.laba1_chusov

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.bignerdranch.android.laba1_chusov.ui.theme.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laba1_ChusovTheme {
                // A surface container using the 'background' color from the theme
                Surface(

                    modifier = Modifier.fillMaxSize(),
                    color = MyGreenLight
                ) {
                    Row(

                    ) {
                        Column(
                            Modifier
                                .fillMaxWidth()
                                .wrapContentSize(Alignment.Center)
                        ) {
                            Spacer(modifier = Modifier.size(100.dp))
                            Box(
                                modifier = Modifier
                                    .offset(x = 0.dp, y = 15.dp)
                                    .size(360.dp, 100.dp)
                                    .clip(
                                        RoundedCornerShape(
                                            topStart = 30.dp,
                                            topEnd = 0.dp,
                                            bottomEnd = 30.dp,
                                            bottomStart = 0.dp
                                        )
                                    )
                                    .background(orange)
                            ) {
                                Text(
                                    text = "Вечерний поход в кино",
                                    fontSize = 20.sp,
                                    color = White,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(15.dp)
                                )
                                Text(
                                    text = "Идем в кино с коллегами!",
                                    fontSize = 14.sp,
                                    color = ttext,
                                    modifier = Modifier
                                        .offset(x = -22.dp, y = 1.dp)
                                        .padding(40.dp)
                                )
                                Text(
                                    text = "10.02.2021",
                                    fontSize = 14.sp,
                                    color = ttext,
                                    modifier = Modifier
                                        .offset(x = 250.dp, y = 15.dp)
                                        .padding(4.dp)
                                )
                                Text(
                                    text = "19:40",
                                    fontSize = 14.sp,
                                    color = ttext,
                                    modifier = Modifier
                                        .offset(x = 250.dp, y = 30.dp)
                                        .padding(4.dp)
                                )
                            }
                            Spacer(modifier = Modifier.size(20.dp))
                            Box(
                                modifier = Modifier
                                    .offset(x = 0.dp, y = 15.dp)
                                    .size(360.dp, 100.dp)
                                    .clip(
                                        RoundedCornerShape(
                                            topStart = 30.dp,
                                            topEnd = 0.dp,
                                            bottomEnd = 30.dp,
                                            bottomStart = 0.dp
                                        )
                                    )
                                    .background(orange)
                            ) {
                                Row() {}
                                Text(
                                    text = "Забрать заказ Ozon",
                                    fontSize = 20.sp,
                                    color = White,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(15.dp)
                                )
                                Text(
                                    text = "Пункт выдачи на ул. Ленина, 103",
                                    fontSize = 14.sp,
                                    color = ttext,
                                    modifier = Modifier
                                        .offset(x = -22.dp, y = 1.dp)
                                        .padding(40.dp)
                                )
                                Text(
                                    text = "10.02.2021",
                                    fontSize = 14.sp,
                                    color = ttext,
                                    modifier = Modifier
                                        .offset(x = 220.dp, y = -20.dp)
                                        .padding(40.dp)
                                )
                                Text(
                                    text = "19:40",
                                    fontSize = 14.sp,
                                    color = ttext,
                                    modifier = Modifier
                                        .offset(x = 220.dp, y = -5.dp)
                                        .padding(40.dp)
                                )
                            }
                            Spacer(modifier = Modifier.size(20.dp))
                            Box(
                                modifier = Modifier
                                    .offset(x = 0.dp, y = 15.dp)
                                    .size(360.dp, 100.dp)
                                    .clip(
                                        RoundedCornerShape(
                                            topStart = 30.dp,
                                            topEnd = 0.dp,
                                            bottomEnd = 30.dp,
                                            bottomStart = 0.dp
                                        )
                                    )
                                    .background(orange)
                            ) {
                                Text(
                                    text = "Запись в автосервис",
                                    fontSize = 20.sp,
                                    color = White,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(15.dp)
                                )
                                Text(
                                    text = "Сдать автомобиль в автосервис на ул.",
                                    /*text ="Бисертская, д. 14. Замена масла",*/
                                    fontSize = 14.sp,
                                    color = ttext,
                                    modifier = Modifier
                                        .offset(x = -22.dp, y = 1.dp)
                                        .padding(40.dp)

                                )
                                Text(
                                    text = "Бисертская, д. 14. Замена масла",
                                    fontSize = 14.sp,
                                    color = ttext,
                                    modifier = Modifier
                                        .offset(x = -22.dp, y = 15.dp)
                                        .padding(40.dp)

                                )
                                Text(
                                    text = "10.02.2021",
                                    fontSize = 14.sp,
                                    color = ttext,
                                    modifier = Modifier
                                        .offset(x = 220.dp, y = -20.dp)
                                        .padding(40.dp)
                                )
                                Text(
                                    text = "19:40",
                                    fontSize = 14.sp,
                                    color = ttext,
                                    modifier = Modifier
                                        .offset(x = 220.dp, y = -5.dp)
                                        .padding(40.dp)
                                )
                            }
                        }
                    }
                    Row(

                    ) {val context = LocalContext.current
                        Column(
                            Modifier
                                .fillMaxWidth()
                                .wrapContentSize(Alignment.Center)
                        ) {

                            Spacer(modifier = Modifier.size(360.dp))
                            Button(modifier = Modifier
                                .size(360.dp, 55.dp)
                                .offset(x = 1.dp, y =140.dp),onClick = {val intent = Intent(context, UserLoginReg::class.java)
                                ContextCompat.startActivity(context, intent, null)},colors = ButtonDefaults.buttonColors(backgroundColor = pan)) {
                                /*androidx.compose.material3.*/Text(
                                    text = "Добавить задачу",
                                    color = White
                                )

                            }
                        }

                    }
                    Row(

                    )
                    {
                        val context = LocalContext.current
                        Text(
                            text = stringResource(R.string.List),
                            color = White,
                            fontSize = 27.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.offset(x = 15.dp, y = 12.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.avatar),
                            contentDescription = null,
                            /*contentScale = ContentScale.Crop,*/
                            modifier = Modifier
                                .size(60.dp)
                                .offset(x = 180.dp, y = 5.dp).
                                clickable(onClick =
                                {
                                    val intent = Intent(context, ProfileActivity::class.java)
                                    startActivity(context,intent, null)
                                })
                        )
                    }
                    /*Greeting("Android")*/
                }
            }
            BottomPanel()
        }
    }
}

@Composable
fun BottomPanel() {
    val context = LocalContext.current

    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)
        .offset(y = 580.dp)) {
        Box(modifier = Modifier
            .size(320.dp, 80.dp)/*.offset(x=100.dp,y = 70.dp)*/
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
        ){
            Row(modifier = Modifier.padding(all = 8.dp)) {
                Column (modifier = Modifier.padding(start = 24.dp, top = 8.dp)) {
                    Image(
                        painter = painterResource(R.drawable.list),
                        contentDescription = "list",
                        modifier = Modifier
                            .size(40.dp)
                    )
                    Text(
                        text = "list",
                        color = settings,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center),
                        fontSize = 10.sp
                    )
                }
                Column (modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                    Image(

                        painter = painterResource(R.drawable.alarm),
                        contentDescription = "Alarm",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable(onClick =
                            {
                                val intent = Intent(context, AlarmActivity::class.java)
                                startActivity(context, intent, null)
                            })
                    )
                    Text(
                        text = "Alarm",
                        color = Red,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center),
                        fontSize = 10.sp
                    )
                }
                Column (modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                    Image(
                        painter = painterResource(R.drawable.calendar),
                        contentDescription = "List",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable(onClick =
                            {
                                val intent = Intent(context, CalendarActivity::class.java)
                                startActivity(context, intent, null)
                            })
                    )
                    Text(
                        text = "Calendar",
                        color = Red,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center),
                        fontSize = 10.sp
                    )
                }
                Column (modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
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
                    Text(
                        text = "Settings",
                        color = Red,
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
