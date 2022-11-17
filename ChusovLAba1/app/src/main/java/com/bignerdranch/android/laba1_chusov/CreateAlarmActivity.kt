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
import androidx.compose.material.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.bignerdranch.android.laba1_chusov.ui.theme.Laba1_ChusovTheme
import com.bignerdranch.android.laba1_chusov.ui.theme.MyGreenLight
import com.bignerdranch.android.laba1_chusov.ui.theme.orange
import com.bignerdranch.android.laba1_chusov.ui.theme.panel

class CreateAlarmActivity : ComponentActivity() {
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

                    )
                    {
                        val context = LocalContext.current
                        androidx.compose.material.Text(
                            text = stringResource(R.string.bydiBudilnik),
                            color = Color.White,
                            fontSize = 27.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.offset(x = 150.dp, y = 12.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.backbutton),
                            contentDescription = null,
                            /*contentScale = ContentScale.Crop,*/
                            modifier = Modifier
                                .size(60.dp)
                                .offset(x = 280.dp, y = 5.dp)
                                .clickable(onClick =
                                {
                                    val intent = Intent(context, ProfileActivity::class.java)
                                    ContextCompat.startActivity(context, intent, null)
                                })
                        )
                    }
                    Column()
                    {
                        Box(
                            modifier = Modifier
                                .background(MyGreenLight)
                                .fillMaxWidth()
                                .weight(0.03f)
                        )
                        {

                        }
                        Box(
                            modifier = Modifier
                                .background(MyGreenLight)
                                .fillMaxWidth()
                                .weight(0.1f)
                        )
                        {
                            editSecond()
                        }


                        Box(
                            modifier = Modifier
                                .background(MyGreenLight)
                                .fillMaxWidth()
                                .weight(0.017f)
                        )
                        {

                        }
                        Box(
                            modifier = Modifier
                                .background(MyGreenLight)
                                .fillMaxWidth()
                                .weight(0.019f)
                        )
                        {


                        }
                    }
                    button5_1()
                    Log_1()
                }
            }
        }
    }

/*
                    Greeting("Android")
*/
            }

            @Composable
            fun editSecond() {

                val textState1 = remember { mutableStateOf(TextFieldValue()) }
                TextField(
                    value = textState1.value,
                    placeholder = { Text(text = "16:30")},
                    textStyle = TextStyle(fontSize = 16.sp),
                    colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
                    onValueChange = { textState1.value = it },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.gray_alarm),
                            modifier = Modifier.size(23.dp),
                            contentDescription = "Проверено"
                        )
                    },
                    modifier = Modifier
                        .offset(x = 25.dp, y = 0.dp)
                        .clip((RoundedCornerShape(12)))
                        .size(160.dp, 52.dp)
                        .background(Color.White)
                )
               /* Image(
                    painter = painterResource(id = R.drawable.gray_alarm),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(22.dp)
                        .offset(x = 35.dp, y = 15.dp)

                )*/
                val textState = remember { mutableStateOf(TextFieldValue()) }
                TextField(
                    value = textState.value,
                    placeholder = { Text(text = "14.01.2021")},
                    textStyle = TextStyle(fontSize = 16.sp),
                    colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
                    onValueChange = { textState.value = it },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.greycal),
                            modifier = Modifier.size(23.dp),
                            contentDescription = "Проверено"
                        )
                    },
                    modifier = Modifier
                        .offset(x = 240.dp, y = 0.dp)
                        .clip((RoundedCornerShape(12)))
                        .size(160.dp, 52.dp)
                        .background(Color.White
                        )
                )


                Text(
                    text = "Повторять каждый ",
                    color = Color.White,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .offset(x = (25).dp, y = 75.dp)
                )
                AddCheckBox("Понедельник", 100)
                AddCheckBox("Вторник", 145)
                AddCheckBox("Среда", 190)
                AddCheckBox("Четверг", 235)
                AddCheckBox("Пятница", 280)
                AddCheckBox("Суббота", 320)
                AddCheckBox("Воскресенье", 360)

            }

            @Composable
            fun AddCheckBox(name: String, y: Int) {
                val checkedState = remember { mutableStateOf(false) }
                Row(
                    modifier = Modifier
                        .size(198.dp, 48.dp)
                        .offset(x = 17.dp, y = y.dp)
                        .padding(start = 8.dp), verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = checkedState.value,
                        onCheckedChange = { checkedState.value = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = Green,
                            uncheckedColor = orange,
                            checkmarkColor = Red
                        ),
                        modifier = Modifier
                            .background(Color.White)
                            .size(18.dp)
                    )
                    Text(
                        text = name,
                        style = TextStyle(fontSize = 18.sp, color = Color.White),
                        modifier = Modifier.padding(start = 10.dp)
                    )
                }
            }


@Composable
fun button5_1(){
    val context = LocalContext.current
    Column(
        Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center)
    ) {

        Spacer(modifier = Modifier.size(360.dp))
        Button(
            modifier = Modifier
                .size(340.dp, 50.dp)
                .offset(x = 0.dp, y = 60.dp),
            onClick = {val intent = Intent(context, ProfileActivity::class.java)
                ContextCompat.startActivity(context, intent, null)
            },
            colors = ButtonDefaults.buttonColors(backgroundColor = panel)
        ) {
            /*androidx.compose.material3.*/androidx.compose.material.Text(
            text = "Создать будильник",
            color = Color.White
        )

        }
    }
}

@Composable
fun Log_1() {
    val context = LocalContext.current
    Column(
        Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center)
    ) {

        Row(

        )
        {
            val context = LocalContext.current
            androidx.compose.material.Text(
                text = stringResource(R.string.bydiBudilnik),
                color = Color.White,
                fontSize = 27.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.offset(x = -18.dp, y = -270.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.backbutton),
                contentDescription = null,
                /*contentScale = ContentScale.Crop,*/
                modifier = Modifier
                    .size(60.dp)
                    .offset(x = 10.dp, y = -280.dp)
                    .clickable(onClick =
                    {
                        val intent = Intent(context, ProfileActivity::class.java)
                        ContextCompat.startActivity(context, intent, null)
                    })
            )
        }
    }
}
