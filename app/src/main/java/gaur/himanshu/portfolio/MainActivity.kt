package gaur.himanshu.portfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import gaur.himanshu.portfolio.ui.theme.PortfolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PortfolioTheme {
                // A surface container using the 'background' color from the theme
                Portfolio()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Portfolio() {

    Surface(
        elevation = 12.dp,
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth()
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(12.dp)
        ) {

            Image(
                painter = painterResource(R.drawable.profile), contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Divider()


            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Himanshu Gaur", style = TextStyle(
                    color = Color.Green,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Text(text = "Android Compose Developer", style = MaterialTheme.typography.caption)


            Spacer(modifier = Modifier.height(8.dp))

            Row {
                Image(
                    painter = painterResource(id = R.drawable.instagram), contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )

                Text(
                    text = "/vision_android",
                    style = MaterialTheme.typography.caption,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
            }

            Spacer(modifier = Modifier.height(4.dp))

            Row {


                Image(
                    painter = painterResource(id = R.drawable.github), contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )

                Text(
                    text = "/himanshuGaur684",
                    style = MaterialTheme.typography.caption,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )

            }
            Spacer(modifier = Modifier.height(12.dp))

            Button(onClick = { }) {
                Text(text = "My Projects")
            }

        }


    }

}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PortfolioTheme {
        Greeting("Android")
    }
}