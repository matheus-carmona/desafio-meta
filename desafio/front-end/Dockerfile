
FROM node:12.2.0

WORKDIR /app

COPY package.json /app/package.json
RUN npm install
RUN npm install -g @angular/cli@9.0.4

COPY . /app

CMD ["ng", "serve", "--host", "0.0.0.0"]