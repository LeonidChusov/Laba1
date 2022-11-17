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
import com.bignerdranch.android.laba1_chusov.ui.theme.pan

class AddTaskActivity : ComponentActivity() {
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
                            text = stringResource(R.string.izmenit1),
                            color = Color.White,
                            fontSize = 27.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.offset(x = 15.dp, y = 12.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.strelka),
                            contentDescription = null,
                            /*contentScale = ContentScale.Crop,*/
                            modifier = Modifier
                                .size(60.dp)
                                .offset(x = 100.dp, y = 5.dp).clickable(onClick =
                                {
                                    val intent = Intent(context, ProfileActivity::class.java)
                                    ContextCompat.startActivity(context, intent, null)
                                })
                        )
                    }
                    TrxtView2_1()
                    TrxtView2_2()
                    TrxtView2_3()
                    TrxtView2_4()
                    button2_2()
                }
            }
        }
    }

    @Composable
    fun TrxtView2_1() {

        Column(
            modifier = Modifier
                .padding(top = 100.dp, end = 140.dp)
                .offset(35.dp, 200.dp)
        ) {
            val textState1 = remember { mutableStateOf(TextFieldValue()) }
            TextField(
                value = textState1.value,
                placeholder = { Text(text = "Описание задачи")},
                textStyle = TextStyle(fontSize = 16.sp),
                colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
                onValueChange = { textState1.value = it },
                leadingIcon = {
                },
                modifier = Modifier
                    .offset(x = 25.dp, y = 0.dp)
                    .clip((RoundedCornerShape(12)))
                    .size(340.dp, 162.dp)
                    .background(Color.White)
            )
        }
    }

    @Composable
    fun TrxtView2_2() {

        Column(
            modifier = Modifier
                .padding(top = 20.dp, end = 210.dp)
                .offset(38.dp, 220.dp)
        ) {
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
        }
    }

    @Composable
    fun TrxtView2_3() {

        Column(
            modifier = Modifier
                .padding(top = -30.dp, end = 230.dp)
                .offset(15.dp, 220.dp)
        ) {
            val textState1 = remember { mutableStateOf(TextFieldValue()) }
            TextField(
                value = textState1.value,
                placeholder = { Text(text = "Заголовок задачи")},
                textStyle = TextStyle(fontSize = 16.sp),
                colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
                onValueChange = { textState1.value = it },
                leadingIcon = {

                },
                modifier = Modifier
                    .offset(x = 25.dp, y = 0.dp)
                    .clip((RoundedCornerShape(12)))
                    .size(160.dp, 52.dp)
                    .background(Color.White)
            )
        }
    }

    @Composable
    fun TrxtView2_4() {

        Column(
            modifier = Modifier
                .padding(top = 20.dp, end = 270.dp)
                .offset(180.dp, 220.dp)
        ) {
            val textState1 = remember { mutableStateOf(TextFieldValue()) }
            TextField(
                value = textState1.value,
                placeholder = { Text(text = "14.01.2021")},
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
        }
    }

    @Composable
    fun button2_2() {
        val context = LocalContext.current
        Column(

            Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
        ) {

            Spacer(modifier = Modifier.size(360.dp))
            Button(
                modifier = Modifier
                    .size(360.dp, 55.dp)
                    .offset(x = 1.dp, y = 25.dp),
                onClick = {
                    val intent = Intent(context, AlarmActivity::class.java)
                    ContextCompat.startActivity(context, intent, null)
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = pan)
            ) {
                androidx.compose.material.Text(
                    text = "Записать задачу",
                    color = Color.White
                )

            }
        }
    }
}