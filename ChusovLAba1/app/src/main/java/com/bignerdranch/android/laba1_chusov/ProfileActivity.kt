package com.bignerdranch.android.laba1_chusov

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
/*import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text*/
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.bignerdranch.android.laba1_chusov.ui.theme.Laba1_ChusovTheme
import com.bignerdranch.android.laba1_chusov.ui.theme.MyGreenLight
import com.bignerdranch.android.laba1_chusov.ui.theme.pan
import org.w3c.dom.Text


class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laba1_ChusovTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MyGreenLight
                ) { val context = LocalContext.current
                    Row(

                    )

                    {

                        androidx.compose.material.Text(
                            text = stringResource(R.string.polsovatel),
                            color = Color.White,
                            fontSize = 27.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.offset(x = 15.dp, y = 12.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.backbutton),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(60.dp)
                                .offset(x = 40.dp, y = 5.dp).clickable(onClick =
                                {
                                    val intent = Intent(context, MainActivity::class.java)
                                    ContextCompat.startActivity(context, intent, null)
                                })
                        )
                    }
                    Row(

                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.aaaavatar),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(290.dp)
                                .offset(x = 65.dp, y = 150.dp)
                        )
                    }
                    Row(

                    )
                    {
                        androidx.compose.material.Text(
                            text = "Вход не выполнен",
                            fontSize = 15.sp,
                            color = Color.White,
                            modifier = Modifier
                                .padding(15.dp)
                                .offset(x = 130.dp, y = 430.dp)
                        )

                    }
                    Row(

                    ) { val context = LocalContext.current
                        Column(
                            Modifier
                                .fillMaxWidth()
                                .wrapContentSize(Alignment.Center)
                        ) {

                            Spacer(modifier = Modifier.size(330.dp))
                            Button(modifier = Modifier
                                .size(360.dp, 55.dp)
                                .offset(x = 1.dp, y = 170.dp),onClick = {val intent = Intent(context, UserLoginVoiti::class.java)
                                ContextCompat.startActivity(context, intent, null)

                            },colors = ButtonDefaults.buttonColors(backgroundColor = pan)) {

                                androidx.compose.material.Text(
                                    text = "Войти",
                                    color = Color.White
                                )


                            }

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

                            Spacer(modifier = Modifier.size(330.dp))
                            Button(onClick = {val intent = Intent(context, UserLoginRegestracia::class.java)
                                ContextCompat.startActivity(context, intent, null)

                            }, modifier = Modifier
                                .size(360.dp, 55.dp)
                                .offset(x = 1.dp, y = 240.dp),colors = ButtonDefaults.buttonColors(backgroundColor = pan),) {
                                Row() {
                                    androidx.compose.material.Text(
                                        text = "Регистрация",
                                        color = Color.White
                                    )
                                }


                            }
                        }

                    }
                }
            }
        }
    }
