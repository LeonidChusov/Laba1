package com.bignerdranch.android.laba1_chusov

import android.content.Intent
import android.graphics.drawable.shapes.Shape
import android.media.Image
import android.os.Bundle
import android.provider.ContactsContract
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.bignerdranch.android.laba1_chusov.ui.theme.*

class UserLoginReg : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContent {
                val message = remember { mutableStateOf("") }
                /* TextField(value = "Hello Work", onValueChange = {}, leadingIcon = ())*/
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
                            Text(
                                text = stringResource(R.string.izmenit),
                                color = White,
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
                                        startActivity(context, intent, null)
                                    })
                            )

                                /*Greeting("Android")*/

                        }
                        TrxtView1_1()
                        TrxtView1_2()
                        TrxtView1_3()
                        TrxtView1_4()
                        button1()
                        button2()
                    }
                }
            }
        }
    }
}

        @Composable
        fun TrxtView1_1() {
            Column(
                modifier = Modifier
                    .padding(top = 10.dp, end = 10.dp)
                    .offset(10.dp, 140.dp)
            ) {
                val textState1 = remember { mutableStateOf(TextFieldValue()) }
                TextField(
                    value = textState1.value,
                    placeholder = { Text(text = "Заголовок задачи") },
                    textStyle = TextStyle(fontSize = 16.sp),
                    colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
                    onValueChange = { textState1.value = it },
                    leadingIcon = {},
                    modifier = Modifier
                        .offset(x = 22.dp, y = 0.dp)
                        .clip((RoundedCornerShape(12)))
                        .size(340.dp,60.dp)
                        .background(Color.White)
                )
            }
        }



        @Composable
        fun TrxtView1_2() {
            Column(
                modifier = Modifier
                    .padding(top = 10.dp, end = 220.dp)
                    .offset(180.dp, 220.dp)
            ) {
                val textState1 = remember { mutableStateOf(TextFieldValue()) }
                TextField(
                    value = textState1.value,
                    placeholder = { Text(text = "16:30") },
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
        fun TrxtView1_3() {
            Column(
                modifier = Modifier
                    .padding(top = 10.dp, end = 220.dp)
                    .offset(10.dp, 220.dp)
            ) {
                val textState1 = remember { mutableStateOf(TextFieldValue()) }
                TextField(
                    value = textState1.value,
                    placeholder = { Text(text = "14.01.2021") },
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
        fun TrxtView1_4() {
            Column(
                modifier = Modifier
                    .padding(top = 100.dp, end = 10.dp)
                    .offset(10.dp, 200.dp)
            ) {
                val textState1 = remember { mutableStateOf(TextFieldValue()) }
                TextField(
                    value = textState1.value,
                    placeholder = { Text(text = "Описание задачи") },
                    textStyle = TextStyle(fontSize = 16.sp),
                    colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
                    onValueChange = { textState1.value = it },
                    leadingIcon = {},
                    modifier = Modifier
                        .offset(x = 22.dp, y = 0.dp)
                        .clip((RoundedCornerShape(12)))
                        .size(340.dp,170.dp)
                        .background(Color.White)
                )
            }
        }

@Composable
fun button1(){
    Column(
        Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center)
    ) {

        Spacer(modifier = Modifier.size(360.dp))
        Button(
            modifier = Modifier
                .size(360.dp, 55.dp)
                .offset(x = 1.dp, y = 100.dp),
            onClick = {},
            colors = ButtonDefaults.buttonColors(backgroundColor = Red)
        ) {
            /*androidx.compose.material3.*/Text(
            text = "Удалить задачу",
            color = White
        )

        }
    }
}
@Composable
fun button2(){
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
            onClick = { val intent = Intent(context, AddTaskActivity::class.java)
                ContextCompat.startActivity(context, intent, null)},
            colors = ButtonDefaults.buttonColors(backgroundColor = pan)
        ) {
            Text(
            text = "Записать задачу",
            color = White
            )

        }
    }
}