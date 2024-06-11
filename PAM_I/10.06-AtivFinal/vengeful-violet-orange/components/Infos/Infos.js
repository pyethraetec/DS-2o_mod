import React from 'react';
import { View, Button, Image, Text } from 'react-native';
import logo from '../../assets/capa.jpg';
import styles from '../../styles';


export default function TelaInicial (props) {
  return (
    <View style={styles.container}>
      <Image source={logo} style={styles.imagem}/>

      <Text style={styles.titulo}>
        Salvador
      </Text>
        Saiba mais sobre a primeira capital do Brasil!
      <Text style={styles.textos}>
      </Text>

      <Button 
        title="Informações" 
        onPress={() => props.navigation.navigate("Informações gerais")} color="#007fc4" 
      />
      <Button 
        title="Pontos turisticos" 
        onPress={() => props.navigation.navigate("Pontos Turisticos")} color="#007fc4" 
      />
      <Button 
        title="ELEIÇÕES DO GRÊMIO ESTUDANTIL 2024" 
        onPress={() => props.navigation.navigate("ELEIÇÕES DO GRÊMIO ESTUDANTIL 2024")} color="#007fc4" /
      > 
    </View>
  )
}

