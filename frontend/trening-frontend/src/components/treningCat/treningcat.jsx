import { useState, useEffect } from "react";
import TrainingDesc from "./trainingdesc";
const TrainCatalog = () => {
  const [data, setData] = useState(null);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await fetch("http://localhost:8080/trainings");
        const json = await response.json();
        setData(json);
      } catch (error) {
        console.error(error);
      }
    };

    fetchData();
  }, []);
  //   console.log(data);
  return (
    <div>
      {data &&
        data.map((item, index) => <TrainingDesc key={index} trendata={item} />)}
    </div>
  );
};

export default TrainCatalog;
