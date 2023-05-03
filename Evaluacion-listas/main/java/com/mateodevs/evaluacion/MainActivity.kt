package com.mateodevs.evaluacion
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.mateodevs.evaluacion.ui.theme.EvaluacionTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EvaluacionTheme {
         Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colors.background
    ) {
          Scaffold(
           topBar = {
               TopAppBar(title={ Text(text = "Laptops")})
           }
       ) { padding->
           MediaList(laptopList = Datasource().loadLaptops(),
               modifier = Modifier.padding(padding))
       }
    }

            }
        }
    }
}

//@Preview
@Composable
fun MediaList(laptopList: List<Laptop>,modifier: Modifier=Modifier){
    LazyColumn(
        modifier = modifier
    ){
        items(laptopList){ laptop->
            MediaItem(laptop)
        }
    }
}




//@Preview(showBackground = true)
@Composable
fun MediaItem(item: Laptop){
    Card(modifier = Modifier.padding(8.dp), elevation = 5.dp) {
    Column() {
        Box(
            modifier= Modifier
                .height(200.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(item.imageResourceId),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.primary)
                .padding(15.dp)
        ) {
            Row() {
            Text(text = stringResource(id = item.stringResourceId),
            style = MaterialTheme.typography.h6,
            color = Color.White)
            Spacer(modifier = Modifier.width(5.dp))
            Text(text =" ${item.intResourceId}",
            style = MaterialTheme.typography.h6,
            color = Color.White)
            }
        }

      /*  Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.primary)
                .padding(2.dp)
        ) {
            Text(text = "id: ${item.id}",
                style = MaterialTheme.typography.h6,
            color = Color.White)
        }
*/

    }
    }
}
