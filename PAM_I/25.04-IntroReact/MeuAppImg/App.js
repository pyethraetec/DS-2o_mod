//importa os elementos que vai ser utilizado
//precisa importar tudo
//vai pra pasta ASSETS
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, Image} from 'react-native';
import Logo from './assets/logoEtec.jpg';

//
export default function App() {
  return (
    <View style={styles.container}>
      <Text>ETEC Rodrigues de Abreu</Text>

      //source = da onde vem | style = como vai ser estilizado
      <Image source={Logo} style='auto'> </Image>

      //Indica como a barra de status do dispositivo vai se comportar
      <StatusBar style="auto" />
    </View>
  );
}

//CSS
//responsável por estilizar a view
const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
