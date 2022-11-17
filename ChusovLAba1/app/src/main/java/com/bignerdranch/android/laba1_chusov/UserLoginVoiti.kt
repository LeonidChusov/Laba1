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
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
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
import com.bignerdranch.android.laba1_chusov.ui.theme.panel

class UserLoginVoiti : ComponentActivity() {
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
                            text = stringResource(R.string.Vxod),
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
                                .offset(x = 240.dp, y = 5.dp).clickable(onClick =
                                {
                                    val intent = Intent(context, ProfileActivity::class.java)
                                    ContextCompat.startActivity(context, intent, null)
                                })
                        )
                    }
                    button4_1()
                    TrxtView2_5()
                    TrxtView2_6()
                }
            }
        }
    }
}

@Composable
fun button4_1(){
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
                .offset(x = 0.dp, y = -110.dp),
            onClick = {val intent = Intent(context, ProfileActivity::class.java)
                ContextCompat.startActivity(context, intent, null)
            },
            colors = ButtonDefaults.buttonColors(backgroundColor = panel)
        ) {
            /*androidx.compose.material3.*/androidx.compose.material.Text(
            text = "Войти",
            color = Color.White
        )

        }
    }
}

@Composable
fun TrxtView2_5() {
    Column(modifier = Modifier.padding(top = 110.dp, end = 10.dp).offset(-5.dp, 150.dp)) {
        run {
            val textState1 = remember { mutableStateOf(TextFieldValue()) }
            TextField(
                value = textState1.value,
                placeholder = { Text(text = "Имя пользователя") },
                textStyle = TextStyle(fontSize = 16.sp),
                colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
                onValueChange = { textState1.value = it },
                leadingIcon = {

                },
                modifier = Modifier
                    .offset(x = 25.dp, y = 0.dp)
                    .clip((RoundedCornerShape(12)))
                    .size(350.dp, 52.dp)
                    .background(Color.White)
            )
        }
    }
}
@Composable
fun TrxtView2_6() {
    Column(modifier = Modifier.padding(top = 170.dp, end = 20.dp).offset(-5.dp, 150.dp)) {
        run {
            val textState1 = remember { mutableStateOf(TextFieldValue()) }
            TextField(
                value = textState1.value,
                placeholder = { Text(text = "Пароль") },
                textStyle = TextStyle(fontSize = 16.sp),
                colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
                onValueChange = { textState1.value = it },
                leadingIcon = {

                },
                modifier = Modifier
                    .offset(x = 25.dp, y = 0.dp)
                    .clip((RoundedCornerShape(12)))
                    .size(350.dp, 52.dp)
                    .background(Color.White)
            )
        }
    }
}
