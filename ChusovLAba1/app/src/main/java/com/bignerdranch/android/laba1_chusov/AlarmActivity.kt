package com.bignerdranch.android.laba1_chusov

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Surface
import android.widget.Switch
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.SwitchDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.bignerdranch.android.laba1_chusov.ui.theme.*
import androidx.compose.material.*


class AlarmActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laba1_ChusovTheme {val context = LocalContext.current
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MyGreenLight
                ) {
                    Row(
                    )
                    {

                        androidx.compose.material.Text(
                            text = stringResource(R.string.aalarm),
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
                        })
                        )
                    }
                    Row(
                    )
                    {
                        Text(
                            text = "7:30",
                            color = Color.White,
                            modifier = Modifier
                                .width(160.dp)
                                .offset(y = 80.dp)
                                .wrapContentSize(Alignment.Center),
                            fontSize = 60.sp
                        )
                    }
                        Row(
                        )
                        {
                            Text(
                                text = "8:00",
                                color = Color.White,
                                modifier = Modifier
                                    .width(160.dp)
                                    .offset(y = 170.dp)
                                    .wrapContentSize(Alignment.Center),
                                fontSize = 60.sp
                            )
                        }
                    Row(
                    ) {val context = LocalContext.current
                        Column(
                            Modifier
                                .fillMaxWidth()
                                .wrapContentSize(Alignment.Center)
                        ) {

                            Spacer(modifier = Modifier.size(200.dp))
                            Button(modifier = Modifier
                                .size(360.dp, 55.dp)
                                .offset(x = 1.dp, y = 290.dp),onClick = {val intent = Intent(context, CreateAlarmActivity::class.java)
                                ContextCompat.startActivity(context, intent, null)},colors = ButtonDefaults.buttonColors(backgroundColor = pan)) {
                            Text(text = "Добавить будильник",  color = Color.White)

                            }
                        }

                    }

                }
            }
            BottomPanel1()
            SwitchDemo()
            SwitchDemo2()
        }
    }
}
@Composable
fun BottomPanel1() {
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
                                val intent = Intent(context, MainActivity::class.java)
                                ContextCompat.startActivity(context, intent, null)
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

                        painter = painterResource(R.drawable.greenalarm),
                        contentDescription = "Alarm",
                        modifier = Modifier
                            .size(40.dp)

                    )
                    androidx.compose.material.Text(
                        text = "Alarm",
                        color = settings,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center),
                        fontSize = 10.sp
                    )
                }
                Column(modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                    Image(
                        painter = painterResource(R.drawable.calendar),
                        contentDescription = "List",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable(onClick =
                            {
                                val intent = Intent(context, CalendarActivity::class.java)
                                startActivity(context,intent, null)
                            })
                    )
                    androidx.compose.material.Text(
                        text = "Calendar",
                        color = Color.Red,
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

@Composable
fun SwitchDemo() {
    val checkedState = remember { mutableStateOf(true) }
    Switch(checked = checkedState.value, onCheckedChange = {checkedState.value = it},
        colors = SwitchDefaults.colors(checkedThumbColor = Color(0xFFFFFFFF),
            checkedTrackColor = Color(0xFFAAF683),
            uncheckedThumbColor = Color(0xFFFFFFFFF),
            uncheckedTrackColor = Color(0xFFFF9885)),
        modifier = Modifier.
        offset(x=170.dp, y = 100.dp).
        size(70.dp, 45.dp).
        offset(x=125.dp, y = 5.dp).
        background(
        color = (if (checkedState.value){
            Color(0xFFAAF683)
        }else{
            Color(0xFFFF9885)
        }), shape = RoundedCornerShape(25.dp)))
}
@Composable
fun SwitchDemo2() {
    val checkedState = remember { mutableStateOf(false) }
    Switch(checked = checkedState.value,
        onCheckedChange = {checkedState.value = it},
        colors = SwitchDefaults.colors(checkedThumbColor = Color(0xFFFFFFFF),
            checkedTrackColor = Color(0xFFAAF683),
            uncheckedThumbColor = Color(0xFFFFFFFFF),
            uncheckedTrackColor = Color(0xFFFF9885)),
        modifier = Modifier.
        offset(x=170.dp, y = 190.dp).
        size(70.dp, 45.dp).
        offset(x=125.dp, y = 5.dp).
        background(
        color = (if (checkedState.value){
            Color(0xFFAAF683)
        }else{
            Color(0xFFFF9885)
        }), shape = RoundedCornerShape(25.dp)))
}