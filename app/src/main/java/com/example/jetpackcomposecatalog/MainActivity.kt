package com.example.jetpackcomposecatalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecatalog.ui.theme.JetPackComposeCatalogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeCatalogTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    COnstraintExample1()
                }
            }
        }
    }
}


@Composable
fun MyComplexLayout() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan)
        ) {

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red)
            ) {

            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Hola Soy Pablo Developer")
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta)
        ) {

        }
    }
}

@Composable
fun MySpacer(space: Int) {
    Spacer(modifier = Modifier.height(space.dp))
}

@Composable
fun ComplexLayoutWithTexts() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo Uno")
        }
        MySpacer(space = 30)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo Dos")
            }
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo Tres")
            }
        }
        MySpacer(space = 40)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Ejemplo Cuatro")
        }
    }
}


@Composable
fun MyRow() {
//    Row(modifier = Modifier.fillMaxSize(),
//    horizontalArrangement = Arrangement.SpaceBetween,
//    ) {
//        Text(text = "Ejemplo1")
//        Text(text = "Ejemplo2")
//        Text(text = "Ejemplo3")
//        Text(text = "Ejemplo4")
//        Text(text = "Ejemplo5")
//    }
//
//    Row(modifier = Modifier.fillMaxSize()) {
//        Text(text = "Ejemplo1", modifier = Modifier.weight(1f))
//        Text(text = "Ejemplo2", modifier = Modifier.weight(1f))
//        Text(text = "Ejemplo3", modifier = Modifier.weight(1f))
//    }

    Row(
        modifier = Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState())
    ) {

        Text(text = "Ejemplo1", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo2", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo3", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo4", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo5", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo6", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo7", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo8", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo9", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo10", modifier = Modifier.width(100.dp))


    }
}


@Composable
fun MyColumn() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(
                rememberScrollState()
            ), verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Ejemplo1", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo2", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo3", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo4", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo5", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo6", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo7", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo8", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo9", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo10", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo11", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo12", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo13", modifier = Modifier.weight(1f))
    }
}

@Composable
fun MyBox() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .background(Color.Magenta)
                .verticalScroll(
                    rememberScrollState()
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Esto es un ejemplo")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetPackComposeCatalogTheme {
        COnstraintExample1()
    }
}