import { StyleSheet } from "react-native";

const styles = StyleSheet.create({
  container: {
    backgroundColor: '#fff',
    flex: 1,
    alignItems: 'center',
    justifyContent: "space-between",
    padding: 20
  },
  boxDescricao: {
    alignItems: "center"
  },

  titulo: {
    color: '#000',
    fontSize: 20,
    marginBottom: 10,
    fontWeight: '700',
    textAlign: "center"
  },
  textos: {
    color: '#000',
    fontSize: 16,
    marginBottom: 10,
    textAlign: "center"
  },

  imagem: {
    width: 200,
    height: 200,
    marginBottom: 10
  },

  boxBotoes: {
    width: 200,
    flexDirection: 'row',
    justifyContent: "space-between"
  }
});

export default styles;